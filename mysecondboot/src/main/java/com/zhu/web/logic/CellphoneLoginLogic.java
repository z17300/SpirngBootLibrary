package com.zhu.web.logic;


import com.zhu.web.member.Phone;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CellphoneLoginLogic {
    private List<Phone> phoneMember;

    public  boolean MemberExist(String mobile) {
        phoneMember=new ArrayList<>();
        phoneMember.add(new Phone("13588795588"));
        phoneMember.add(new Phone("15355460729"));
        for (Phone member: phoneMember
             ) {
            if (mobile.equals(member.getPhoneNember())){
                return true;
            }//判断当前列表是否有当前成员

        }

        return false;
    }
}
