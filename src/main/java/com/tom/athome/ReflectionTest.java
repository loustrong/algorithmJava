package com.tom.athome;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * Reflection Test
 *
 * @author Tom on 2021/1/1
 */
public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        if(args.length > 0){ name = args[0];}
        else{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name (e.g. java.util.Date):");
            name = in.next();
        }
        try{
            //print class name and superclass name (if !=Object)
            Class c1= Class.forName(name);
            Class supercls = c1.getSuperclass();
            String modifiers = Modifier.toString(c1.getModifiers());
            if(modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println("class " + name);
            if(supercls != null && supercls != Object.class) System.out.println(" Extension " +
                    supercls.getName());
            System.out.println("\n{\n");
            printConstructors(c1);
            System.out.println();
            printMethods(c1);
            System.out.println();
            printFields(c1);
            System.out.println("}\n");

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        System.exit(0);
    }

    private static void printFields(Class c1) {
        Field[] fields = c1.getDeclaredFields();
        for(Field f : fields){
            Class type = f.getType();
            String name = f.getName();
            System.out.println("   ");
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length() > 0) System.out.println(modifiers + " ");
            System.out.println(type.getName() + " " + name + "");
        }
    }

    /**
     * Print all methods of a class
     * @param c1
     */
    private static void printMethods(Class c1) {
        Method[] methods = c1.getDeclaredMethods();
        for(Method m: methods){
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.println("   ");
            // print modifiers, return type and method name
            String modifiers = Modifier.toString(m.getModifiers());
            if(modifiers.length() > 0){
                System.out.println(modifiers + "");
            }
            System.out.println(retType.getName() + " " + name + "(");
        }
    }

    private static void printConstructors(Class c1) {
        Constructor[] constructors = c1.getDeclaredConstructors();
        for(Constructor c: constructors){
            String name = c.getName();
            System.out.println("  ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length() > 0){
                System.out.print(modifiers + " " );
            }
            System.out.println(name + "(");
            Class[] paraTypes = c.getParameterTypes();
            for(int j = 0; j < paraTypes.length; j++){
                if(j > 0){
                    System.out.println(paraTypes[j].getName());
                }
                System.out.println(");");
            }

        }
    }
}
