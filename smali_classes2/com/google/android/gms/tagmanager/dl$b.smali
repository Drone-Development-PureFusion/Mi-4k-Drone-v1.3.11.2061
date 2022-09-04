.class Lcom/google/android/gms/tagmanager/dl$b;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/tagmanager/dl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/dl;

.field private final b:Lcom/google/android/gms/tagmanager/b$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tagmanager/dl;Lcom/google/android/gms/tagmanager/b$a;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/dl$b;->a:Lcom/google/android/gms/tagmanager/dl;

    invoke-direct {p0, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/dl$b;->b:Lcom/google/android/gms/tagmanager/b$a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/tagmanager/dl$b;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/dl$b;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method protected b(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/dl$b;->b:Lcom/google/android/gms/tagmanager/b$a;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/dl$b;->a:Lcom/google/android/gms/tagmanager/dl;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/tagmanager/b$a;->a(Lcom/google/android/gms/tagmanager/b;Ljava/lang/String;)V

    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Don\'t know how to handle this message."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/aw;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/tagmanager/dl$b;->b(Ljava/lang/String;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
