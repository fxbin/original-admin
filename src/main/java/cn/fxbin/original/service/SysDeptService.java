package cn.fxbin.original.service;

import cn.fxbin.original.controller.dept.dto.DeptCreateDTO;
import cn.fxbin.original.controller.dept.vo.DeptVO;
import cn.fxbin.original.model.SysDept;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * SysDeptService
 *
 * @author fxbin
 * @version v1.0
 * @since 2020/9/18 18:54
 */
public interface SysDeptService {

    /**
     * save
     *
     * @since 2020/9/21 18:38
     * @param createDTO cn.fxbin.original.controller.dept.dto.DeptCreateDTO
     * @return java.lang.Integer
     */
    Integer save(DeptCreateDTO createDTO);

    /**
     * findDeptTree
     *
     * @since 2020/9/21 18:46
     * @return java.util.List<cn.fxbin.original.controller.dept.vo.DeptVO>
     */
    List<DeptVO> findDeptTree();

}
