.class Lcom/google/android/gms/internal/apu$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/apd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/apu;
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

    iput-object p1, p0, Lcom/google/android/gms/internal/apu$1;->a:Lcom/google/android/gms/internal/apu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/apu$1;->a:Lcom/google/android/gms/internal/apu;

    iget-object v1, p0, Lcom/google/android/gms/internal/apu$1;->a:Lcom/google/android/gms/internal/apu;

    invoke-static {v1}, Lcom/google/android/gms/internal/apu;->d(Lcom/google/android/gms/internal/apu;)Z

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/apu;->a(ZZ)V

    return-void
.end method
