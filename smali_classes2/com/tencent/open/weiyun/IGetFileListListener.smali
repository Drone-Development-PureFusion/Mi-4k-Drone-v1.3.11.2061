.class public interface abstract Lcom/tencent/open/weiyun/IGetFileListListener;
.super Ljava/lang/Object;


# virtual methods
.method public abstract onComplete(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/tencent/open/weiyun/WeiyunFile;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onError(Lcom/tencent/tauth/UiError;)V
.end method
