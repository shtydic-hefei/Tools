chmod +x fastdfs.5.05-dic.bin
./fastdfs.5.05-dic.bin

��ɺ�
vim /etc/fdfs/storage.conf
addresstracker_server=192.168.198.129:22122 ����Ҫ����127.0.0.1��
Ȼ�������沽������

1.����
����trackerd����service fdfs_trackerd start
����storaged�� service fdfs_storaged start

����nginx�� /usr/local/nginx/sbin/nginx
2.�ر�
service fdfs_trackerd stop
service fdfs_storaged stop
/usr/local/nginx/sbin/nginx -s stop


�ϴ�����
vim /etc/fdfs/client.conf
�޸�
tracker_server=192.168.198.129:22122

���ļ��ϴ����
/usr/bin/fdfs_test /etc/fdfs/client.conf upload  + �����ļ� 
����
/usr/bin/fdfs_test /etc/fdfs/client.conf upload  test.txt