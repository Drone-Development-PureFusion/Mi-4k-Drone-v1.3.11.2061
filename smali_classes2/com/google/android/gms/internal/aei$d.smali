.class final Lcom/google/android/gms/internal/aei$d;
.super Lcom/google/android/gms/internal/aei$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aei;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/aei$b",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aei;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/aei;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aei$d;->a:Lcom/google/android/gms/internal/aei;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/aei$b;-><init>(Lcom/google/android/gms/common/api/g;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/aei$d;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aej;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aei$d;->a(Lcom/google/android/gms/internal/aej;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/aej;)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/aei$d$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aei$d$1;-><init>(Lcom/google/android/gms/internal/aei$d;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/aei$d;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/aej;->a(Lcom/google/android/gms/internal/ael;Ljava/lang/String;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aei$d;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
