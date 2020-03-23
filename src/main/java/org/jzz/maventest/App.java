package org.jzz.maventest;

/**
 * 测试maven打包模式
 * 添加了对本地项目（studyProj）的依赖
 */
import org.jzz.study.DataStructure.*;
public class App 
{
	
	public static void test() {
		BaseNode node = new BaseNode() {
			
			@Override
			public String getValue() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BaseNode getRight() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BaseNode getParent() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public BaseNode getLeft() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		System.out.println("App.test():" + node.getValue());
	}
	
    public static void main( String[] args )
    {	
    	test();
        System.out.println( "Hello World!" );
    }
}
