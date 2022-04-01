package com.wish.common.utils;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname TokenUtil
 * @Description :
 * @Date 2021/7/9 21:14
 * @Author cfy
 */
public class TokenUtil {
    public static final String TOKEN = "token";
    public static final String PROJECTID = "";

    private static final Logger logger = LoggerFactory.getLogger(TokenUtil.class);
    /** token 默认秘钥 */
    private static final String TOKEN_KEY = "Yuan-1353044575@qq.com";
    /** token 默认过期时间 毫秒级 */
    public static final Long DEFAULT_TIME = 30 * 60 * 1000L;
    public static final Long DEFAULT_TIME_REDIS = 30 * 60L;
    private static final String MAP_USERNAME = "userName";
    private static final String MAP_USERID = "userId";
    private static final String MAP_PROJECTID = "projectId";
    private static final String MAP_LOGINID = "loginId";

    public static String createToken(String userId ,String userName,String loginId){
        return createToken(userId,userName,PROJECTID,loginId,null);
    }
    /**
     * 默认时间token
     * @param userId
     * @param userName
     * @param projectId
     * @param loginId
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/9 10:43
     * @version: 0.0.1
     */
    public static String createToken(String userId ,String userName,String projectId,String loginId){
        return createToken(userId,userName,projectId,loginId,null);
    }
    /**
     * 创建token
     * @param userId 用户id
     * @param userName 用户名
     * @param projectId 项目id
     * @param time 过期时间
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/2 9:17
     * @version: 0.0.1
     */
    public static String createToken(String userId ,String userName,String projectId,String loginId,Long time){
        if(ObjectUtil.isObjectBlank(time)){
            time = DEFAULT_TIME;
        }
        Date date = new Date(System.currentTimeMillis() + time);
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_KEY);
        Map<String ,Object> headerMap = new HashMap<>(1);
        headerMap.put("typ", "JWT");
        headerMap.put("alg","HS256");
        String token = JWT.create().withHeader(headerMap)
                .withClaim(MAP_USERNAME, userName)
                .withClaim(MAP_USERID, userId)
                .withClaim(MAP_PROJECTID, projectId)
                .withClaim(MAP_LOGINID, loginId)
                .withIssuedAt(new Date())
                .withExpiresAt(date)
                .sign(algorithm);
        return token;
    }
    /**
     * 更新token时间
     * @param token
     * @param time
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/9 10:39
     * @version: 0.0.1
     */
    public static String updateToken(String token,Long time){
        if(ObjectUtil.isObjectNotBlank(time)){
            time = DEFAULT_TIME;
        }
        Date date = new Date(System.currentTimeMillis() + time);
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_KEY);
        Map<String ,Object> headerMap = new HashMap<>(1);
        headerMap.put("typ", "JWT");
        headerMap.put("alg","HS256");
        String tokens = JWT.create().withHeader(headerMap)
                .withClaim(MAP_USERNAME, getTokenUserName(token))
                .withClaim(MAP_USERID, getTokenUserId(token))
                .withClaim(MAP_PROJECTID, getTokenProjectId(token))
                .withClaim(MAP_LOGINID, getTokenLoginId(token))
                .withIssuedAt(new Date())
                .withExpiresAt(date)
                .sign(algorithm);
        return tokens;
    }



    /**
     * 获取 token UserId
     * @param token
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/2 9:57
     * @version: 0.0.1
     */
    public static String getTokenUserId(String token){
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_KEY);
        JWTVerifier build = JWT.require(algorithm).build();
        Claim claim = build.verify(token).getClaim(MAP_USERID);

        return claim.asString();
    }
    /**
     * 获取 token 唯一登录id
     * @param token
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/2 9:57
     * @version: 0.0.1
     */
    public static String getTokenLoginId(String token){
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_KEY);
        JWTVerifier build = JWT.require(algorithm).build();
        Claim claim = build.verify(token).getClaim(MAP_LOGINID);
        return claim.asString();
    }
    /**
     * 获取 token userName
     * @param token
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/2 9:57
     * @version: 0.0.1
     */
    public static String getTokenUserName(String token){
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_KEY);
        JWTVerifier build = JWT.require(algorithm).build();
        Claim claim = build.verify(token).getClaim(MAP_USERNAME);
        return claim.asString();
    }

    /**
     * 获取 token projectId
     * @param token
     * @return: java.lang.String
     * @author: cfy
     * @date: 2021/3/2 9:57
     * @version: 0.0.1
     */
    public static String getTokenProjectId(String token){
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_KEY);
        JWTVerifier build = JWT.require(algorithm).build();
        Claim claim = build.verify(token).getClaim(MAP_PROJECTID);
        return claim.asString();
    }
    /**
     * 获取全部请求数据
     * @param token
     * @return: java.util.Map<java.lang.String,com.auth0.jwt.interfaces.Claim>
     * @author: cfy
     * @date: 2021/3/2 10:02
     * @version: 0.0.1
     */
    public static Map<String, Claim> getTokenClaims(String token){
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_KEY);
        JWTVerifier build = JWT.require(algorithm).build();
        Map<String, Claim> claims = build.verify(token).getClaims();
        return claims;
    }
    /**
     * 验证token有效性
     * @param token
     * @return: boolean
     * @author: cfy
     * @date: 2021/3/2 9:47
     * @version: 0.0.1
     */
    public static boolean verify(String token){
        try{
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_KEY);
            JWTVerifier build = JWT.require(algorithm).build();
            DecodedJWT verify = build.verify(token);
            return true;
        }catch (RuntimeException e){
            logger.info("验签失败");
            return false;
        }
    }

}
