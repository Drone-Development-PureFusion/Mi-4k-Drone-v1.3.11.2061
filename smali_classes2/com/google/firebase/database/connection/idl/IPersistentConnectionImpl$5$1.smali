.class Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hm$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;->a(ZLcom/google/firebase/database/connection/idl/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/database/connection/idl/f;

.field final synthetic b:Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;


# direct methods
.method constructor <init>(Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;Lcom/google/firebase/database/connection/idl/f;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5$1;->b:Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5;

    iput-object p2, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5$1;->a:Lcom/google/firebase/database/connection/idl/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5$1;->a:Lcom/google/firebase/database/connection/idl/f;

    invoke-interface {v0, p1}, Lcom/google/firebase/database/connection/idl/f;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/database/connection/idl/IPersistentConnectionImpl$5$1;->a:Lcom/google/firebase/database/connection/idl/f;

    invoke-interface {v0, p1}, Lcom/google/firebase/database/connection/idl/f;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
