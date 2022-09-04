.class public abstract Lcom/google/android/gms/internal/agm$c;
.super Lcom/google/android/gms/internal/agm$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/agm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/agm$b",
        "<",
        "Lcom/google/android/gms/cast/a/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/cast/a/a;

.field final synthetic b:Lcom/google/android/gms/internal/agm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/agm;Lcom/google/android/gms/cast/a/a;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/agm$c;->b:Lcom/google/android/gms/internal/agm;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/agm$b;-><init>(Lcom/google/android/gms/internal/agm;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/agm$c;->a:Lcom/google/android/gms/cast/a/a;

    new-instance v0, Lcom/google/android/gms/internal/agm$c$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/agm$c$1;-><init>(Lcom/google/android/gms/internal/agm$c;Lcom/google/android/gms/internal/agm;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/agm$c;->f:Lcom/google/android/gms/cast/internal/p;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/agm$c;)Lcom/google/android/gms/cast/a/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$c;->a:Lcom/google/android/gms/cast/a/a;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/a/a$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/agm$d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/agm$d;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/cast/a/a;)V

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/agm$c;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/a/a$a;

    move-result-object v0

    return-object v0
.end method
