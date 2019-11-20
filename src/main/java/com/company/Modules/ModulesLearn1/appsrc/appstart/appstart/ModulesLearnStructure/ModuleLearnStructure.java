package com.company.Modules.ModulesLearn1.appsrc.appstart.appstart.ModulesLearnStructure;

import com.company.Modules.ModulesLearn1.appsrc.appfuncs.appfuncs.simplefuncs.ModuleLearnSimpleFunctions;

public class ModuleLearnStructure {
    public static void main (String[] args){
        if (ModuleLearnSimpleFunctions.methodCheckIfMultiplier(2,10))
            System.out.println(" 2 is multiplier of 10");

        System.out.println("The smallest multiplier of 35 and 105: "
                + ModuleLearnSimpleFunctions.methodReturnSmallestMultiplier(35,105));
        System.out.println("The largest multiplier of 35 and 105: "
                        + ModuleLearnSimpleFunctions.methodReturnLargestMultiplier(35, 105));
    }
}
