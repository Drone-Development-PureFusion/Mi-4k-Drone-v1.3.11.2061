.class Lcom/google/android/gms/internal/ez$4;
.super Lcom/google/android/gms/wallet/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ez;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Lcom/google/android/gms/internal/ez;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ez;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ez$4;->d:Lcom/google/android/gms/internal/ez;

    iput-object p3, p0, Lcom/google/android/gms/internal/ez$4;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ez$4;->b:Ljava/lang/String;

    iput p5, p0, Lcom/google/android/gms/internal/ez$4;->c:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/wallet/d$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/fa;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ez$4;->a(Lcom/google/android/gms/internal/fa;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/fa;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ez$4;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ez$4;->b:Ljava/lang/String;

    iget v2, p0, Lcom/google/android/gms/internal/ez$4;->c:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/fa;->a(Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ez$4;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
