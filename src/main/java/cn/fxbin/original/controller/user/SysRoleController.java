package cn.fxbin.original.controller.user;

import cn.fxbin.bubble.fireworks.core.model.PageResult;
import cn.fxbin.bubble.fireworks.core.model.Result;
import cn.fxbin.bubble.fireworks.web.support.BaseController;
import cn.fxbin.original.controller.user.dto.RoleCreateDTO;
import cn.fxbin.original.controller.user.dto.RolePageDTO;
import cn.fxbin.original.controller.user.dto.UserPageDTO;
import cn.fxbin.original.controller.user.vo.RoleVO;
import cn.fxbin.original.service.SysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * SysRoleController
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:11
 */
@Api(tags = "角色管理")
@RestController
@RequestMapping("role")
public class SysRoleController extends BaseController {

    @Resource
    private SysRoleService sysRoleService;

    @ApiOperation(value = "保存角色")
    @PostMapping("/save")
    public Result<Integer> save(@RequestBody RoleCreateDTO createDTO) {
        return success(sysRoleService.save(createDTO));
    }


    @ApiOperation(value = "分页查询")
    @PostMapping("/findPage")
    public Result<PageResult<RoleVO>> findPage(@RequestBody RolePageDTO rolePageDTO) {
        return success(sysRoleService.findPage(rolePageDTO));
    }

//    @ApiOperation(value = "删除角色")
//    @ApiOperation(value = "查询角色菜单")
//    @ApiOperation(value = "保存角色菜单")

}
