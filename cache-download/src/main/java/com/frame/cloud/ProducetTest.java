package com.frame.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProducetTest {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        this.test();
        return "hi " + name + ",i am from port:" + port;
    }

    private void test() {
        int[] min = {4, 3, 5, 2, 1};
        int[] max = {4, 1, 5, 6, 8, 9, 2, 7, 6, 3};
        int minL = 0;
        int maxL = 0;
        for (int i = 0; i < min.length; i++) {
            for (int j = 0; j < max.length; j++) {
                minL++;
                if (min[i] == max[j]) {
                    break;
                }
            }
        }

        for (int i = 0; i < max.length; i++) {
            for (int j = 0; j < min.length; j++) {
                maxL++;
                if (max[i] == min[j]) {

                    break;
                }
            }
        }

        System.out.println("minL = " + minL + ", maxL = " + maxL);
    }
}
