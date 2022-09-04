.class Lcom/google/android/gms/internal/jt$6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/jt;->a(Lcom/google/android/gms/internal/jk;)Lcom/google/android/gms/internal/jr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/google/android/gms/internal/js;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/jt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/jt;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/jt$6;->a:Lcom/google/android/gms/internal/jt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/js;Lcom/google/android/gms/internal/js;)I
    .locals 4

    iget-wide v0, p1, Lcom/google/android/gms/internal/js;->c:J

    iget-wide v2, p2, Lcom/google/android/gms/internal/js;->c:J

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/mk;->a(JJ)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/js;

    check-cast p2, Lcom/google/android/gms/internal/js;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/jt$6;->a(Lcom/google/android/gms/internal/js;Lcom/google/android/gms/internal/js;)I

    move-result v0

    return v0
.end method
