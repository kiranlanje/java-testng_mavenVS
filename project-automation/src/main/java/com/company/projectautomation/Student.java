package com.company.projectautomation;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data //Lombak annotation
public class Student {
    private String name;
    private int rollNo;

    public void sayHello()
    {
        System.out.println("This is Student");
        System.out.println(name+ "" + rollNo);
    }
}
