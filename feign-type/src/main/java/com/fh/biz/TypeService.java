package com.fh.biz;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.websocket.server.PathParam;

@FeignClient(value = "springboot-type",fallback = MyFallBack.class)
public interface TypeService {
    /**根据id查找
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/type/findById/{id}",method = RequestMethod.GET)
    String findById(@PathParam("id") Integer id);
}
