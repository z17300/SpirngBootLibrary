package com.zhu.web.services;

import com.zhu.web.common.MemberUtil;
import com.zhu.web.logic.CellphoneLoginLogic;
import org.apache.commons.lang.StringUtils;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component//如果不加入这个标签则spring扫描不到也不会进行实体化
@RemoteProxy
public class LoginDwr {
    @Autowired
    private CellphoneLoginLogic cellphoneLoginLogic;
    public String sendValidationCode(String mobile){
//        System.out.print(mobile);
        if (StringUtils.isBlank(mobile)||!MemberUtil.phoneformat(mobile)) {
            return "请输入正确的号码";
        }
        if (cellphoneLoginLogic.MemberExist(mobile)){
            return "该号码已经存在请重新输入";
        }
        return "注册成功";
    }

}
