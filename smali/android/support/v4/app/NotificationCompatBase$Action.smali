.class public abstract Landroid/support/v4/app/NotificationCompatBase$Action;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationCompatBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Action"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract getActionIntent()Landroid/app/PendingIntent;
.end method

.method protected abstract getExtras()Landroid/os/Bundle;
.end method

.method protected abstract getIcon()I
.end method

.method protected abstract getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
.end method

.method protected abstract getTitle()Ljava/lang/CharSequence;
.end method
