# webdavTc
webdav图床

## 配置

| 属性                                      | 说明                            | 是否必填 |
| ----------------------------------------- | ------------------------------- | -------- |
| spring.servlet.multipart.max-request-size | 限制上传图片大小，建议10m       | √        |
| spring.servlet.multipart.max-file-size    | 同上                            | √        |
| webdav.url                                | 要上传到哪个webdav              | √        |
| webdav.path                               | 要上传到哪个路径下              | √        |
| webdav.requestPath                        | 上传完成后，访问的url，前端展示 | √        |
| webdav.username                           | webdav账号，建议设置            | ×        |
| webdav.password                           | webdav密码，建议设置            | ×        |
| server.port                               | 程序端口，默认8080              | ×        |

