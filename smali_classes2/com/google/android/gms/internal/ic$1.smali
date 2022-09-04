.class final Lcom/google/android/gms/internal/ic$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hm;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ic;->a(Lcom/google/android/gms/internal/hy;)Lcom/google/android/gms/internal/hm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ic$1;->a:Lcom/google/android/gms/internal/hy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZLcom/google/android/gms/internal/hm$a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ic$1;->a:Lcom/google/android/gms/internal/hy;

    new-instance v1, Lcom/google/android/gms/internal/ic$1$1;

    invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/ic$1$1;-><init>(Lcom/google/android/gms/internal/ic$1;Lcom/google/android/gms/internal/hm$a;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/hy;->a(ZLcom/google/android/gms/internal/hy$a;)V

    return-void
.end method
