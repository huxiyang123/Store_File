package studyInterface;

import java.io.InputStream;

/*
 * ���������߲���ִ����ϣ�ͨ��send����֪ͨ�����ߡ�		
 */
public interface Callback {
	void send(InputStream bs);
}