package cn.fxbin.original.controller.user;

import cn.fxbin.bubble.fireworks.core.model.PageResult;
import cn.fxbin.bubble.fireworks.core.model.Result;
import cn.fxbin.bubble.fireworks.web.support.BaseController;
import cn.fxbin.original.controller.user.dto.UserCreateDTO;
import cn.fxbin.original.controller.user.dto.UserPageDTO;
import cn.fxbin.original.controller.user.vo.RoleVO;
import cn.fxbin.original.controller.user.vo.UserVO;
import cn.fxbin.original.service.SysUserRoleService;
import cn.fxbin.original.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * SysUserController
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:09
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("user")
public class SysUserController extends BaseController {

    @Resource
    private SysUserService sysUserService;


    @ApiOperation(value = "保存用户")
    @PostMapping("/save")
    public Result<Integer> save(@RequestBody UserCreateDTO createDTO) {
        return success(sysUserService.save(createDTO));
    }

    @ApiOperation(value = "分页查询")
    @PostMapping("/findPage")
    public Result<PageResult<UserVO>> findPage(@RequestBody UserPageDTO userPageDTO) {
        return success(sysUserService.findPage(userPageDTO));
    }

    @ApiOperation(value = "根据名称查询")
    @GetMapping("/findByUsername")
    public Result<UserVO> findByName(String username) {
        return success(sysUserService.findByUsername(username));
    }

    @ApiOperation(value = "查询用户权限")
    @GetMapping("/findPermissions")
    public Result<Boolean> findPermissions() {
        return success();
    }

    @ApiOperation(value = "查询用户角色")
    @DeleteMapping("/findUserRoles")
    public Result<List<RoleVO>>  findUserRoles(Integer userId) {
        return success(sysUserService.findUserRoles(userId));
    }



}