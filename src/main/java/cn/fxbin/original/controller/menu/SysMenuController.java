package cn.fxbin.original.controller.menu;

import cn.fxbin.bubble.fireworks.core.model.Result;
import cn.fxbin.bubble.fireworks.web.support.BaseController;
import cn.fxbin.original.controller.dept.vo.DeptVO;
import cn.fxbin.original.controller.menu.dto.MenuCreateDTO;
import cn.fxbin.original.controller.menu.vo.MenuVO;
import cn.fxbin.original.service.SysMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * SysMenuController
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/21 18:07
 */
@Api(tags = "菜单管理")
@RestController
@RequestMapping("menu")
public class SysMenuController extends BaseController {

    @Resource
    private SysMenuService sysMenuService;

    @ApiOperation(value = "保存菜单")
    @PostMapping("/save")
    public Result<Integer> save(@RequestBody MenuCreateDTO createDTO) {
        return success(sysMenuService.save(createDTO));
    }

//    @ApiOperation(value = "删除菜单")
//    @ApiOperation(value = "查询导航菜单树")


    @ApiOperation(value = "查询菜单树")
    @GetMapping("/findMenuTree")
    public Result<List<MenuVO>> findMenuTree() {
        return success(sysMenuService.findMenuTree());
    }


}
