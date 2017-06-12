package site.moree.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import site.moree.bean.ApiResult;

/**
 * Created by MORE-E on 6/12/2017.
 */
@Controller
@RequestMapping(value = "/api/v1")
public class SampleController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult test() {
        return ApiResult.RESULT_SUCCESS;
    }
}
