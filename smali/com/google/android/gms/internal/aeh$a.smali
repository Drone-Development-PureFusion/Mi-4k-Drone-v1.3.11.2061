.class final Lcom/google/android/gms/internal/aeh$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/b/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aeh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/aeh;

.field private b:Lcom/google/android/gms/common/api/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/google/android/gms/b/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aeh;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/b/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/aeh;",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/b/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aeh$a;->a:Lcom/google/android/gms/internal/aeh;

    iput-object p2, p0, Lcom/google/android/gms/internal/aeh$a;->b:Lcom/google/android/gms/common/api/i;

    iput-object p3, p0, Lcom/google/android/gms/internal/aeh$a;->c:Lcom/google/android/gms/b/a;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/aeh$a;->b:Lcom/google/android/gms/common/api/i;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/g;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v1, p0, Lcom/google/android/gms/internal/aeh$a;->c:Lcom/google/android/gms/b/a;

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v0, v4}, Lcom/google/android/gms/internal/aef;->a(Lcom/google/android/gms/b/a;JLjava/lang/String;I)Lcom/google/android/gms/appdatasearch/UsageInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aeh$a;->a:Lcom/google/android/gms/internal/aeh;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/appdatasearch/UsageInfo;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, p1, v2}, Lcom/google/android/gms/internal/aeh;->a(Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/appdatasearch/UsageInfo;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method
