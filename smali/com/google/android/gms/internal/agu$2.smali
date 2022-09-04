.class Lcom/google/android/gms/internal/agu$2;
.super Lcom/google/android/gms/internal/agu$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/agu;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/agu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/agu;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agu$2;->b:Lcom/google/android/gms/internal/agu;

    iput-object p3, p0, Lcom/google/android/gms/internal/agu$2;->a:Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/agu$b;-><init>(Lcom/google/android/gms/internal/agu;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/agv;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/agu$2;->a(Lcom/google/android/gms/internal/agv;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/agv;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/agu$b$a;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/agu$b$a;-><init>(Lcom/google/android/gms/internal/agu$b;Lcom/google/android/gms/internal/agv;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/agu$2;->b:Lcom/google/android/gms/internal/agu;

    invoke-static {v1}, Lcom/google/android/gms/internal/agu;->b(Lcom/google/android/gms/internal/agu;)Lcom/google/android/gms/internal/agy;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/agu$2;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/agv;->a(Lcom/google/android/gms/internal/agw;Lcom/google/android/gms/internal/agy;Ljava/lang/String;)V

    return-void
.end method
