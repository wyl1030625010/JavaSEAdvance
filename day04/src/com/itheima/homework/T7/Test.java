package com.itheima.homework.T7;

/**
 * 1.��֪������(Computer), �п����͹ػ��Ĺ���,�Լ�ʹ�����ͼ��̵Ĺ���
 * <p>
 * 2.��֪�����(Mouse), Ҳ�����ӵ��ԺͶϿ����ԵĹ���
 * connet():��ӡ���������
 * disconnet():��ӡ���Ͽ���
 * 3.��֪������(Keyboard), Ҳ�����ӵ��ԺͶϿ����ԵĹ���
 * connet():��ӡ����������
 * disconnet():��ӡ���̶Ͽ���
 * �ܽ�,ֻҪ�Ƿ���USB�豸�Ķ��������ӵ��ԺͶϿ����ԵĹ���
 * ���д������, ���Ե��Կ���, ����ʹ�����, ����ʹ�ü���, ���Թػ��Ĺ���
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();
        computer.close();
//        computer.useKeyboard();
//        computer.useMouse();
        computer.useUSB(new Mouse());
        computer.useUSB(new Keyboard());
    }
}
