package com.itheima.class_code.StudentManager_Polymorpic.Factory;

import com.itheima.class_code.StudentManager_Polymorpic.controller.BaseStudentController;
import com.itheima.class_code.StudentManager_Polymorpic.controller.OtherStudentController;

public class StudentFacatory {
    public BaseStudentController getStudentDAO(){
        return new OtherStudentController();
    }
}
