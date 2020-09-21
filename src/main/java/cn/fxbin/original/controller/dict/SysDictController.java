package cn.fxbin.original.controller.dict;

import cn.fxbin.bubble.fireworks.core.model.Result;
import cn.fxbin.bubble.fireworks.web.support.BaseController;
import cn.fxbin.original.model.SysDict;
import cn.fxbin.original.service.SysDictService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * SysDictController
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:08
 */
@Api(tags = "字典管理")
@RestController
@RequestMapping("dict")
public class SysDictController extends BaseController {

    @Resource
    private SysDictService sysDictService;

    @PostMapping(value = "/save")
    public Result<Boolean> save(@RequestBody SysDict record) {
        return success(sysDictService.save(record));
    }

    @DeleteMapping(value = "delete")
    public Result<Boolean> delete(List<Integer> idList) {
        return success(sysDictService.removeByIds(idList));
    }

    @GetMapping(value = "/findByLable")
    public Result findByLable(@RequestParam String lable) {
        return success(sysDictService.findByLable(lable));
    }

}
