7.2 修复上一版本BUG，特殊字符转义以及不能搜索所有父类属性。

7.1 添加表记录条数查询语句以及count语句

7.0 将注解和注解解析包分离，方便在其他地方使用

6.1 新增几个基本select语句

6.0 为了是操作更加灵活，该版本恢复泛型DAO层。只需要为DAO曾传入数据库操作对象即可（例如java下的statement，android下的SQLiteDataBase）。
	#1 说明
		首先，通过注释，将需要建立表的类添加上注解。
		然后，TableSession以及DataBaseSession会使用TableHlper类读取注解，并根据注解规则生成相应的SQL语句。
		再次，使用时需要创建DataBaseSession以及TableSession，DataBaseSession需要与数据库操作类相关联，一般作为内置对象；
				TableSessionye需要与操作表的类相关联，同样我们也设置为那只对象。
		接着，该工具提供了一个抽象的DAO类，该类主要为了实现DAO的数据库操作的基本功能；我们需要针对不同的平台编写不同的BasicDAO继承自
				该抽象类，并实现它的所有方法；然后根据具体操作表的DAO继承自BasicDAO实现其功能。
	#2 该工具为注解插件，可以帮助你快速操作数据库而不需要编写基本的增删改查语句。
	
5.x 取消dao层，本来设计为通过只使用database操作所有表，这样更加符合面向对象思想。
	但是真正用于实践中该发现，除了基本的怎删改查意外还有很多其他操作，必须单独实现。故此版本抛弃，直接进化到6.x版本。
	
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






		


	
	

	






