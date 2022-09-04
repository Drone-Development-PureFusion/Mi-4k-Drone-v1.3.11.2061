.class Lcom/google/android/gms/internal/ang$4;
.super Lcom/google/android/gms/internal/ang$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ang;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/nearby/connection/a$b;Lcom/google/android/gms/nearby/connection/a$d;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:[B

.field final synthetic d:Lcom/google/android/gms/internal/ail;

.field final synthetic e:Lcom/google/android/gms/internal/ail;

.field final synthetic f:Lcom/google/android/gms/internal/ang;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ang;Lcom/google/android/gms/common/api/g;Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/internal/ail;Lcom/google/android/gms/internal/ail;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ang$4;->f:Lcom/google/android/gms/internal/ang;

    iput-object p3, p0, Lcom/google/android/gms/internal/ang$4;->a:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ang$4;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ang$4;->c:[B

    iput-object p6, p0, Lcom/google/android/gms/internal/ang$4;->d:Lcom/google/android/gms/internal/ail;

    iput-object p7, p0, Lcom/google/android/gms/internal/ang$4;->e:Lcom/google/android/gms/internal/ail;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ang$c;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/ang$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/anf;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ang$4;->a(Lcom/google/android/gms/internal/anf;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/anf;)V
    .locals 7

    iget-object v2, p0, Lcom/google/android/gms/internal/ang$4;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/ang$4;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ang$4;->c:[B

    iget-object v5, p0, Lcom/google/android/gms/internal/ang$4;->d:Lcom/google/android/gms/internal/ail;

    iget-object v6, p0, Lcom/google/android/gms/internal/ang$4;->e:Lcom/google/android/gms/internal/ail;

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/anf;->a(Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/internal/ail;Lcom/google/android/gms/internal/ail;)V

    return-void
.end method
