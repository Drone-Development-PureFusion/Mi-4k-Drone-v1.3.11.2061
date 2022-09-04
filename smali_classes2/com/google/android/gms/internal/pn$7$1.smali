.class Lcom/google/android/gms/internal/pn$7$1;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/pn$7;->a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/oj",
        "<",
        "Ljava/sql/Timestamp;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/oj;

.field final synthetic b:Lcom/google/android/gms/internal/pn$7;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/pn$7;Lcom/google/android/gms/internal/oj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/pn$7$1;->b:Lcom/google/android/gms/internal/pn$7;

    iput-object p2, p0, Lcom/google/android/gms/internal/pn$7$1;->a:Lcom/google/android/gms/internal/oj;

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/pp;)Ljava/sql/Timestamp;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/pn$7$1;->a:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/oj;->b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/sql/Timestamp;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/sql/Timestamp;-><init>(J)V

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/sql/Timestamp;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/pn$7$1;->a(Lcom/google/android/gms/internal/ps;Ljava/sql/Timestamp;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ps;Ljava/sql/Timestamp;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/pn$7$1;->a:Lcom/google/android/gms/internal/oj;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/oj;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pn$7$1;->a(Lcom/google/android/gms/internal/pp;)Ljava/sql/Timestamp;

    move-result-object v0

    return-object v0
.end method
