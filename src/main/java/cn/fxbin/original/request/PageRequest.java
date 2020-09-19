package cn.fxbin.original.request;

import lombok.Data;

/**
 * PageRequest
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 19:29
 */
@Data
public class PageRequest {

    private Integer pageNum = 1;

    private Integer pageSize = 10;
}
