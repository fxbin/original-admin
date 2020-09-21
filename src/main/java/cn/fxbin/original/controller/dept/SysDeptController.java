package cn.fxbin.original.controller.dept;

import cn.fxbin.bubble.fireworks.core.model.Result;
import cn.fxbin.bubble.fireworks.web.support.BaseController;
import cn.fxbin.original.controller.dept.dto.DeptCreateDTO;
import cn.fxbin.original.controller.dept.vo.DeptVO;
import cn.fxbin.original.service.SysDeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * SysDeptController
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:08
 */
@Api(tags = "机构管理")
@RestController
@RequestMapping("dept")
public class SysDeptController extends BaseController {

    @Resource
    private SysDeptService sysDeptService;

    @ApiOperation(value = "保存机构")
    @PostMapping("/save")
    public Result<Integer> save(@RequestBody DeptCreateDTO createDTO) {
        return success(sysDeptService.save(createDTO));
    }

    @ApiOperation(value = "查询机构树")
    @GetMapping("/findDeptTree")
    public Result<List<DeptVO>> findDeptTree() {
        return success(sysDeptService.findDeptTree());
    }

}
