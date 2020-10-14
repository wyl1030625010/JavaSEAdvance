package com.itheima.class_code.StudentManager_Polymorpic.Factory;

import com.itheima.class_code.StudentManager_Polymorpic.controller.BaseStudentController;
import com.itheima.class_code.StudentManager_Polymorpic.controller.OtherStudentController;
import com.itheima.class_code.StudentManager_Polymorpic.controller.StudentController;

public class StudentFacatory {
    public BaseStudentController getStudentController(){
        return new OtherStudentController();
        //return new StudentController();
    }
}
