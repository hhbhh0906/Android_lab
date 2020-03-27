## 实验一  Android开发基础实验

#### 1. 建立android工程目录，比如我的工程Android_Lab

![](../lab1_HelloWorld/image/1.png)

#### 2.建立Android工程HelloWorld

![](../lab1_HelloWorld/image/2.png)

#### 3.右键Android_Lab，选择**Git Bash Here**，出现一个Git Bash命令行窗口，建立一个本地仓库

```
git init
```

![](../lab1_HelloWorld/image/3.png)

#### 4.**添加**远程仓库

```
git remote add origin “your url”
```

![](../lab1_HelloWorld/image/4.png)

#### 5.验证是否添加远程仓库成功

```
git remote -v
```

![](../lab1_HelloWorld/image/5.png)

#### 6.上传工程代码

```
git add .

git commit -m "Android_Lab"

git push -u origin master
```

![](../lab1_HelloWorld/image/6.png)

![](../lab1_HelloWorld/image/7.png)

#### 7.在github上查看结果

![](../lab1_HelloWorld/image/8.png)

