package cn.fxbin.original.controller.user;

import cn.fxbin.bubble.fireworks.web.support.BaseController;
import cn.fxbin.original.common.constant.SysConstants;
import com.google.code.kaptcha.Producer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Cleanup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * SysLoginController
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/24 11:26
 */
@Api(tags = "登录管理")
@RestController
@RequestMapping("login")
public class SysLoginController extends BaseController {


    @Resource
    private Producer producer;

    @ApiOperation(value = "验证码图片")
    @GetMapping("captcha.jpg")
    public void captcha() throws IOException {
        response.setHeader("Cache-Control", "no-store,no-cache");
        response.setContentType("image/jpeg");
        // 生成文字验证码
        String text = producer.createText();
        // 生成图片验证码
        BufferedImage image = producer.createImage(text);
        request.getSession().setAttribute(SysConstants.KAPTCHA_SESSION_KEY, text);
        @Cleanup ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
    }

}
