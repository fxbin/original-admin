package cn.fxbin.original.controller.dict;

import cn.fxbin.bubble.fireworks.core.model.Result;
import cn.fxbin.bubble.fireworks.web.support.BaseController;
import cn.fxbin.original.controller.dict.dto.DictCreateDTO;
import cn.fxbin.original.controller.dict.vo.DictVO;
import cn.fxbin.original.model.SysDict;
import cn.fxbin.original.service.SysDictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "保存字典")
    @PostMapping("/save")
    public Result<Integer> save(@RequestBody DictCreateDTO createDTO) {
        return success(sysDictService.save(createDTO));
    }


    @ApiOperation(value = "根据标签查询")
    @GetMapping("/findByLable")
    public Result<List<DictVO>> findByLabel(@RequestParam String label) {
        return success(sysDictService.findByLabel(label));
    }

}
