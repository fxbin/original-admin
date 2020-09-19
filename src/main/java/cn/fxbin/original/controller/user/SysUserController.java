package cn.fxbin.original.controller.user;

import cn.fxbin.bubble.fireworks.core.model.Result;
import cn.fxbin.bubble.fireworks.web.support.BaseController;
import cn.fxbin.original.model.SysUser;
import cn.fxbin.original.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * SysUserController
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:09
 */
@RestController
@RequestMapping("/user")
public class SysUserController extends BaseController {

    @Resource
    private SysUserService sysUserService;

    @GetMapping
    public Result<List<SysUser>> list() {
        return success(sysUserService.list());
    }

}