.class public abstract Lcom/google/android/gms/internal/agm$a;
.super Lcom/google/android/gms/internal/agm$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/agm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/agm$b",
        "<",
        "Lcom/google/android/gms/cast/a/a$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/google/android/gms/internal/agm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/agm;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/agm$a;->e:Lcom/google/android/gms/internal/agm;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/agm$b;-><init>(Lcom/google/android/gms/internal/agm;)V

    new-instance v0, Lcom/google/android/gms/internal/agm$a$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/agm$a$1;-><init>(Lcom/google/android/gms/internal/agm$a;Lcom/google/android/gms/internal/agm;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/agm$a;->f:Lcom/google/android/gms/cast/internal/p;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/a/a$b;
    .locals 7

    const/4 v3, 0x0

    new-instance v1, Lcom/google/android/gms/internal/agm$e;

    const-wide/16 v4, -0x1

    move-object v2, p1

    move-object v6, v3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/agm$e;-><init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;JLorg/json/JSONObject;)V

    return-object v1
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/agm$a;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/a/a$b;

    move-result-object v0

    return-object v0
.end method
