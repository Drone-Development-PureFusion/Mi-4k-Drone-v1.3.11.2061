.class Lcom/google/android/gms/internal/ang$5;
.super Lcom/google/android/gms/internal/ang$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ang;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;[BLcom/google/android/gms/nearby/connection/a$d;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:[B

.field final synthetic c:Lcom/google/android/gms/internal/ail;

.field final synthetic d:Lcom/google/android/gms/internal/ang;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ang;Lcom/google/android/gms/common/api/g;Ljava/lang/String;[BLcom/google/android/gms/internal/ail;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ang$5;->d:Lcom/google/android/gms/internal/ang;

    iput-object p3, p0, Lcom/google/android/gms/internal/ang$5;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ang$5;->b:[B

    iput-object p5, p0, Lcom/google/android/gms/internal/ang$5;->c:Lcom/google/android/gms/internal/ail;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ang$c;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/ang$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/anf;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ang$5;->a(Lcom/google/android/gms/internal/anf;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/anf;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ang$5;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ang$5;->b:[B

    iget-object v2, p0, Lcom/google/android/gms/internal/ang$5;->c:Lcom/google/android/gms/internal/ail;

    invoke-virtual {p1, p0, v0, v1, v2}, Lcom/google/android/gms/internal/anf;->a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;[BLcom/google/android/gms/internal/ail;)V

    return-void
.end method
