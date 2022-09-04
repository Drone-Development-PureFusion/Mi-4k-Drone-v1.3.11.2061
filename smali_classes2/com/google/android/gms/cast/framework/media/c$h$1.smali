.class Lcom/google/android/gms/cast/framework/media/c$h$1;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/framework/media/c$h;-><init>(Lcom/google/android/gms/cast/framework/media/c;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/media/c;

.field final synthetic b:Lcom/google/android/gms/cast/framework/media/c$h;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/media/c$h;Lcom/google/android/gms/cast/framework/media/c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/c$h$1;->b:Lcom/google/android/gms/cast/framework/media/c$h;

    iput-object p2, p0, Lcom/google/android/gms/cast/framework/media/c$h$1;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$h$1;->b:Lcom/google/android/gms/cast/framework/media/c$h;

    iget-object v0, v0, Lcom/google/android/gms/cast/framework/media/c$h;->a:Lcom/google/android/gms/cast/framework/media/c;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c$h$1;->b:Lcom/google/android/gms/cast/framework/media/c$h;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/media/c$h;->a(Lcom/google/android/gms/cast/framework/media/c$h;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c;Ljava/util/Set;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$h$1;->b:Lcom/google/android/gms/cast/framework/media/c$h;

    iget-object v0, v0, Lcom/google/android/gms/cast/framework/media/c$h;->a:Lcom/google/android/gms/cast/framework/media/c;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c;->g(Lcom/google/android/gms/cast/framework/media/c;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c$h$1;->b:Lcom/google/android/gms/cast/framework/media/c$h;

    invoke-static {v1}, Lcom/google/android/gms/cast/framework/media/c$h;->b(Lcom/google/android/gms/cast/framework/media/c$h;)J

    move-result-wide v2

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
