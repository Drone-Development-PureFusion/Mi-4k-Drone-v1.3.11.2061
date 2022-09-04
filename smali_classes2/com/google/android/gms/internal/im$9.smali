.class Lcom/google/android/gms/internal/im$9;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/iu$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/im;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$9;->a:Lcom/google/android/gms/internal/im;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/iv;)V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/iv;Lcom/google/android/gms/internal/hq;Lcom/google/android/gms/internal/iu$a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/im$9;->a:Lcom/google/android/gms/internal/im;

    new-instance v1, Lcom/google/android/gms/internal/im$9$1;

    invoke-direct {v1, p0, p1, p4}, Lcom/google/android/gms/internal/im$9$1;-><init>(Lcom/google/android/gms/internal/im$9;Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/iu$a;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/im;->a(Ljava/lang/Runnable;)V

    return-void
.end method
