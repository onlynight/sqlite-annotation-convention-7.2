7.2 �޸���һ�汾BUG�������ַ�ת���Լ������������и������ԡ�

7.1 ��ӱ��¼������ѯ����Լ�count���

7.0 ��ע���ע����������룬�����������ط�ʹ��

6.1 ������������select���

6.0 Ϊ���ǲ����������ð汾�ָ�����DAO�㡣ֻ��ҪΪDAO���������ݿ�������󼴿ɣ�����java�µ�statement��android�µ�SQLiteDataBase����
	#1 ˵��
		���ȣ�ͨ��ע�ͣ�����Ҫ��������������ע�⡣
		Ȼ��TableSession�Լ�DataBaseSession��ʹ��TableHlper���ȡע�⣬������ע�����������Ӧ��SQL��䡣
		�ٴΣ�ʹ��ʱ��Ҫ����DataBaseSession�Լ�TableSession��DataBaseSession��Ҫ�����ݿ�������������һ����Ϊ���ö���
				TableSessionye��Ҫ�����������������ͬ������Ҳ����Ϊ��ֻ����
		���ţ��ù����ṩ��һ�������DAO�࣬������ҪΪ��ʵ��DAO�����ݿ�����Ļ������ܣ�������Ҫ��Բ�ͬ��ƽ̨��д��ͬ��BasicDAO�̳���
				�ó����࣬��ʵ���������з�����Ȼ����ݾ���������DAO�̳���BasicDAOʵ���书�ܡ�
	#2 �ù���Ϊע���������԰�������ٲ������ݿ������Ҫ��д��������ɾ�Ĳ���䡣
	
5.x ȡ��dao�㣬�������Ϊͨ��ֻʹ��database�������б��������ӷ����������˼�롣
	������������ʵ���и÷��֣����˻�������ɾ�Ĳ����⻹�кܶ��������������뵥��ʵ�֡��ʴ˰汾������ֱ�ӽ�����6.x�汾��
	
4.x This version change the tools set's frame.
	#1 @org.lion.java.sqlite.hibernate.utils.DatabaseAtomicOperationHelper is the util tool to create and delete table's SQL.
	#2 @org.lion.java.sqlite.hibernate.utils.SQLiteTableSession<?> generic type. is the table session class.
		you can extends this class, and then you can use the @org.lion.java.sqlite.hibernate.utils.DatabaseAtomicOperationHelper atomic functions.
	#3 @org.lion.java.sqlite.hibernate.SQLiteDataBaseSession to create table SQL and drop TABLE SQL.
	
3.x This version change the internal create table method.
	#1 if a field without @Column annotation,
		than the TableHelper.class will create an annotation on it and attach the annotation with the field.

2.0 This version allow use one model to create multi table.But the multi table must in the same database.

1.3 This version allow no @Table annotation. 
	 But once you use table helper to create table , the convention will work without annotation.
	 
1.2 This version allow define static value in model and the conventer will not use it as a table column.

1.1 Fix the version 1.0 bugs.
	 Added PackageCanner. This class will help you scan the package, and it will return you classes which annotation are @Table






		


	
	

	






