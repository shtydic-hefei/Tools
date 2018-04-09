chmod +x fastdfs.5.05-dic.bin
./fastdfs.5.05-dic.bin

完成后
vim /etc/fdfs/storage.conf
addresstracker_server=192.168.198.129:22122 （不要配置127.0.0.1）
然后按照下面步骤启动

1.启动
启动trackerd服务：service fdfs_trackerd start
启动storaged： service fdfs_storaged start

启动nginx： /usr/local/nginx/sbin/nginx
2.关闭
service fdfs_trackerd stop
service fdfs_storaged stop
/usr/local/nginx/sbin/nginx -s stop


上传测试
vim /etc/fdfs/client.conf
修改
tracker_server=192.168.198.129:22122

把文件上传命令：
/usr/bin/fdfs_test /etc/fdfs/client.conf upload  + 任意文件 
比如
/usr/bin/fdfs_test /etc/fdfs/client.conf upload  test.txt