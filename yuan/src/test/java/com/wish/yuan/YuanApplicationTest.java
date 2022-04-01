package com.wish.yuan;

import com.wish.common.utils.Md5Util;
import com.wish.common.utils.StringUtil;
import com.wish.yuan.logic.user.entity.UserLogin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname YuanApplicationTests
 * @Description :
 * @Date 2021/7/15 10:08
 * @Author cfy
 */

@RunWith(SpringRunner.class)// 随机创建出一个端口测试
@SpringBootTest(classes = YuanApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class YuanApplicationTest {
    @Autowired
    TestRestTemplate testRestTemplate;
    private Logger logger = LoggerFactory.getLogger(YuanApplicationTest.class);

    @Test
    public void classLoading() {
        UserLogin login = new UserLogin();
        login.setLoginName("11111");
        Map<String, String> map = new HashMap<>();
        map.put("loginName", "111111111111");
        ResponseEntity<com.wish.common.entity.ResponseEntity> responseEntity = testRestTemplate.postForEntity("/order/createOrder", map, com.wish.common.entity.ResponseEntity.class);

        logger.info(responseEntity.getBody().toString());
    }


    @Test
    public void md5UtilTest() {
        String uuid = StringUtil.getUuid();
        logger.info(uuid);
        String md5 = Md5Util.getMd5("13563860938", uuid);
        logger.info(md5);
    }


    @Test
    public void snowflakeTestId() {

//            List<Integer> list = new ArrayList<>();
//        LongStream longStream = list.stream().mapToLong(i -> i.longValue());
//        Stream<Long> boxed = longStream.boxed();
//        Long[] longs1 = longStream.toArray();
//        List<long[]> longs = Arrays.asList(longs1);
    }

}
