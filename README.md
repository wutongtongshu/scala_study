# 1 项目简介
这是一个 scala + java 混合编程练习项目，使用 IDEA 作为开发工具，maven 作为项目管理工具
# 2 环境搭建
1. 要配置 java 和 scala 环境，并为 idea 安装 scala 插件
2. 编译时，到 pom.xml 目录下，命令行工具执行 `mvn scala:compile`, 这个命令只编译 .scala 文件。 也可以执行 `mvn scala:compile compile` 这样就先编译.scala文件，然后再编译 java 文件。
3. scala 文件不能直接运行，因为 jvm 默认从 main 函数开始，注意scala中的 main 方法在编译后，只是普通方法，不是真正的 main 方法。
