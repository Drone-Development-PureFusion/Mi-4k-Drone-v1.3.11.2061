.class Lcom/google/android/gms/internal/aeh$1;
.super Lcom/google/android/gms/internal/aeh$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aeh;->a(Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/appdatasearch/UsageInfo;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/aeh$c",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:[Lcom/google/android/gms/appdatasearch/UsageInfo;

.field final synthetic b:Lcom/google/android/gms/internal/aeh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aeh;Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/appdatasearch/UsageInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aeh$1;->b:Lcom/google/android/gms/internal/aeh;

    iput-object p3, p0, Lcom/google/android/gms/internal/aeh$1;->a:[Lcom/google/android/gms/appdatasearch/UsageInfo;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/aeh$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/aeb;)V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/aeh$d;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aeh$d;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/aeh$1;->a:[Lcom/google/android/gms/appdatasearch/UsageInfo;

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/aeb;->a(Lcom/google/android/gms/internal/aec;Ljava/lang/String;[Lcom/google/android/gms/appdatasearch/UsageInfo;)V

    return-void
.end method
