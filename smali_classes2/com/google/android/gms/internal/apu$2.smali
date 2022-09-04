.class Lcom/google/android/gms/internal/apu$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/apu;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/apu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/apu;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/apu$2;->a:Lcom/google/android/gms/internal/apu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/apu$2;->a:Lcom/google/android/gms/internal/apu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/apu;->a(Lcom/google/android/gms/internal/apu;Z)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/apu$2;->a:Lcom/google/android/gms/internal/apu;

    invoke-static {v0}, Lcom/google/android/gms/internal/apu;->e(Lcom/google/android/gms/internal/apu;)Lcom/google/android/gms/internal/apc;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/apc;->a()V

    return-void
.end method
