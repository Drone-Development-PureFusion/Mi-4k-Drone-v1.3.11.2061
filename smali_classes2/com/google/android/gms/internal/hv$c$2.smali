.class Lcom/google/android/gms/internal/hv$c$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/hv$c;->a(Lcom/google/android/gms/internal/lw;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/hv$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hv$c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hv$c$2;->b:Lcom/google/android/gms/internal/hv$c;

    iput-object p2, p0, Lcom/google/android/gms/internal/hv$c$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c$2;->b:Lcom/google/android/gms/internal/hv$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    iget-object v1, p0, Lcom/google/android/gms/internal/hv$c$2;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/hv;->a(Lcom/google/android/gms/internal/hv;Ljava/lang/String;)V

    return-void
.end method
