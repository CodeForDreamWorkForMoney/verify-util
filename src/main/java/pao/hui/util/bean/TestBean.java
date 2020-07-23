package pao.hui.util.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @PackageName: pao.hui.util.bean
 * @Description:
 * @author: 韩超
 * @date: 2020/7/10
 */

@ApiModel("测试实体类")
@Data
public class TestBean {

    @ApiModelProperty(value = "姓", example = "王")
    private String familyName;

    @ApiModelProperty(value = "名", example = "麻子")
    private String firstName;

    @ApiModelProperty(value = "年龄", example = "18")
    private Integer age;
}
