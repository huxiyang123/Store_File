package homework22;
/*
 * 1 �Զ���ö����Month������12���·ݵ����ƺ�������Ϣ��
  ��д����,����Month���Ͳ�����Ȼ�������·���Ϣ��
 */
public enum EnumMonth {
	JANUARY("һ    ��","Ԫ����"),FEBRUARY("��    ��","���˽�"),MARCH("��    ��","ֲ����"),
	APRIL("��    ��","���˽�"),MAY("��    ��","�Ͷ���"),JUNE("��    ��","��ͯ��"),
	JULY("��    ��","������"),AUGUST("��    ��","������"),SEPTEMBER("��    ��","��ʦ��"),
	OCTOBER("ʮ    ��","�����"),NOVEMBER("ʮһ��","�����"),DECEMBER("ʮ����","ʥ����");
	
	private String name;
	private String festival;
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Ҫ���õ� name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return information
	 */
	public String getFestival() {
		return festival;
	}
	

	private EnumMonth(String name, String festival) {
		this.name = name;
		this.festival = festival;
	}
	public void display(){
		System.out.println("�·ݣ�"+name+"------���գ�"+festival);
	}

}
